(ns ejercicios-clojure.ej45)

(require '[clojure.set :refer [difference]])

(defn ganadores [resultados]
  (set (map (fn [x] (nth x 0)) resultados)))

(defn perdedores [resultados]
  (set (map (fn [x] (nth x 1)) resultados)))

(defn invictos [resultados]
  (difference
    (ganadores resultados)
    (perdedores resultados)))

(defn -main []
  (prn (invictos '(("A", "B"), ("B", "C"), ("A", "C")))))
