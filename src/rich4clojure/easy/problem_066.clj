(ns rich4clojure.easy.problem-066
  (:require [hyperfiddle.rcf :refer [tests]]
            [hashp.core]))

;; = Greatest Common Divisor =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; 
;; Given two integers, write a function which returns the
;; greatest common divisor.

(defn gcd
  "https://en.wikipedia.org/wiki/Greatest_common_divisor#Euclidean_algorithm"
  [x y]
  (loop [a (max x y)
         b (min x y)]
    (let [d (mod a b)]
      (cond
        (= d 0) b
        :else (recur b d)))))

(def __ gcd)

(tests
 (__ 2 4) := 2
 (__ 10 5) := 5
 (__ 5 7) := 1
 (__ 1023 858) := 33)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/4aa85a5a1d6e6962548e6dc69a02a55e