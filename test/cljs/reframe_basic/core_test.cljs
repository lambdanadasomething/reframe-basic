(ns reframe-basic.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [reframe-basic.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
