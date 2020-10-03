(ns talks-in-maths.core-test
  (:require [clojure.test :refer :all]
            [talks-in-maths.core :refer :all]))

(deftest split-space
  (testing "splits on one space"
    (is (= ["a" "b"] (split-ws "a b")))))

(deftest split-spaces
  (testing "splits on two spaces"
    (is (= ["a" "b"] (split-ws "a  b")))))

(deftest len
  (testing "str length"
    (is (= 5 (.length "abcde")))))

(deftest wl
  (testing "calcs word lengths"
    (is (= [1 2] (word-lengths "a bc")))))

(deftest longwords
  (testing "words longer than 1 digit"
    (is (= [1] (word-lengths "01234567890")))))