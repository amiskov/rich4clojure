(ns rich4clojure.easy.problem-022
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Count a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which returns the total number of
;; elements in a sequence.

(def restricted [count])

(def __ #(loop [s % c 0]
           (if (empty? s)
             c
             (recur (rest s) (inc c)))))

(comment
  (def __ #(letfn [(len [s c] (if (empty? s) c (len (rest s) (inc c))))]
             (len % 0))))


(tests
  (__ '(1 2 3 3 1)) := 5
  (__ "Hello World") := 11
  (__ [[1 2] [3 4] [5 6]]) := 3
  (__ '(13)) := 1
  (__ '(:a :b :c)) := 3)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/d55eddc37d7a08a3440748ddb75c7ec4