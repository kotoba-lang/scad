(ns scad-test
  (:require [clojure.test :refer [deftest is testing]]
            [scad]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? scad))))
