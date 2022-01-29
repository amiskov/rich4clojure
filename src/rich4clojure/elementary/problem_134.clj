(ns rich4clojure.elementary.problem-134
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = A nil key =
;; By 4Clojure user: goranjovic
;; Difficulty: Elementary
;; Tags: [maps]
;; 
;; Write a function which, given a key and map, returns
;; true iff the map contains an entry with that key and
;; its value is nil.

(def __ (fn nil-key? [k m]
          (nil? (m k false))))                              ; we can set the default value (DV) for `(hash-map key DV)`

(comment)

(tests
  (__ :a {:a nil :b 2}) := true
  (__ :b {:a nil :b 2}) := false
  (__ :c {:a nil :b 2}) := false)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/70ba70e1e4e0f249a90bc99bda5f8aff