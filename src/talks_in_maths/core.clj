(ns talks-in-maths.core)
(require '[clojure.string :as str])

(defn split-ws
  "splits a string on whitespace"
  [s]
  (str/split s #"\s+"))

(defn word-lengths
  "Calculates the sequence of lengths of words in the given string"
  [txt]
  (map #(mod (.length %) 10) (split-ws txt)))