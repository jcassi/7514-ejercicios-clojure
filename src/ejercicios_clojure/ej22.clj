(ns ejercicios-clojure.ej22
  (:gen-class))

(defn diagonal [matriz]
  (map first (map drop (range) matriz)))

(defn diagonal-rec-aux [matriz pos diag]
  (if (empty? matriz)
    diag
    (recur (rest matriz) (+ pos 1) (conj diag (nth (first matriz) pos)))))

(defn diagonal-rec ([matriz] (diagonal-rec-aux matriz 0 [])))

(defn -main []
  (prn (diagonal '((1 3 2) (5 6 7) (2 8 9))))
  (prn (diagonal-rec '((1 3 2) (5 6 7) (2 8 9)))))