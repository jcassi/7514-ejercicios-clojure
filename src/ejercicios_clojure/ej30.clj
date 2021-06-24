(ns ejercicios-clojure.ej30)

(defn slice [cad n]
  (map (partial apply str) (partition n 1 cad)))

(defn -main []
  (prn (slice "abcde" 3))
  (prn (slice "abcde" 4)))