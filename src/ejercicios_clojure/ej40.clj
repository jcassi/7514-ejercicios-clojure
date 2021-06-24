(ns ejercicios-clojure.ej40)

(defn take-even [L]
  (take-nth 2 L))

(defn take-odd [L]
  (take-even (rest L)))

(defn sumar-filas [f M]
  (reduce + (apply concat (f M))))

(defn dif-sumas [M]
  (- (sumar-filas take-even M) (sumar-filas take-odd M)))

(defn -main []
  (prn (dif-sumas '((1 5 7)(2 4 8)(3 6 7)))))