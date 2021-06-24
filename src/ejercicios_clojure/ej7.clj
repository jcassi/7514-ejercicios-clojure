(ns ejercicios-clojure.ej7)

(defn invertir [num]
  (read-string (apply str (reverse (str num)))))

(defn -main []
  (prn (invertir 456))
  (prn (invertir 5))
  (prn (invertir 31246)))
