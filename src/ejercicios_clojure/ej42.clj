(ns ejercicios-clojure.ej42)

(defn profundidad
  ([L] (profundidad L 0))
  ([L i]
    (if (not (coll? L)) i (apply max (map (fn [x] (profundidad x (+ i 1))) L)))))

(defn -main []
  (prn (profundidad '((2 3)(3 ((7))) 5))))
