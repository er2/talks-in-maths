(ns talks-in-maths.core
  (:require [clojure.string :as str]
         [compojure.core :refer :all]
         [compojure.route :as route]))

(defn split-ws
  "splits a string on whitespace"
  [s]
  (str/split s #"\s+"))

(defn word-lengths
  "Calculates the sequence of lengths of words in the given string"
  [txt]
  (map #(mod (.length %) 10) (split-ws txt)))

(defroutes app
           (GET "/" [] "<h1>Hello World</h1>")
           (POST "/" params (pr-str (word-lengths (slurp (:body params)))))
           (route/not-found "<h1>Page not found</h1>"))