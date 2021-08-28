(ns rich4clojure.easy.problem-028
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Flatten a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which flattens a sequence.

(def restricted [flatten])

(def __
  (fn fltn [s]
    (letfn [(add-to-acc [rest-of-s acc-so-far]
              (let [f (first rest-of-s)]
                (if (sequential? f)
                  (concat acc-so-far (fltn f))
                  (concat acc-so-far (list f)))))]
      (loop [s' s
             acc '()]
        (if (empty? s')
          acc
          (recur (rest s') (add-to-acc s' acc)))))))
(comment
  )

(tests
  (__ '((1 2) 3 [4 [5 6]])) := '(1 2 3 4 5 6)
  (__ ["a" ["b"] "c"]) := '("a" "b" "c")
  (__ '((((:a))))) := '(:a))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/0c6e3c48cac7434882ca4b2c71ebfce1