(ns ejercicios-clojure.ej1
  (:gen-class))

(defn tercer-angulo [x y] (- 180 x y))

(defn -main []
  (prn (tercer-angulo 60 61)))