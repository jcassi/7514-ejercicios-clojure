(ns ejercicios-clojure.ej3
  (:gen-class))

(defn sig-mul-10 [num]
  (* 10 (+ 1 (quot num 10))))

(defn -main []
  (prn (sig-mul-10 199)))


