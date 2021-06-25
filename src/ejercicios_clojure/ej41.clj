(ns ejercicios-clojure.ej41)

(defn intercalar [L1 L2]
  (interleave L1 L2))

(defn -main []
  (prn (intercalar '(1 2 3) '(4 5 6))))
