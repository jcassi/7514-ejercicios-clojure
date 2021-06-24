(ns ejercicios-clojure.ej39)

(defn take-even [L]
  (take-nth 2 L))

(defn take-odd [L]
  (take-even (rest L)))

(defn col-par-fil-imp [matriz]
 (map take-odd (take-even matriz)))

(defn -main []
  (prn (col-par-fil-imp '((1 5 7 9) (2 4 8 4) (3 6 7 8) (6 8 7 3)))))
