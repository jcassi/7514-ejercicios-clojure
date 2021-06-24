(ns ejercicios-clojure.ej24)

(defn frecuencias-nucleotidos [adn]
  (frequencies adn))

(defn -main []
  (prn (frecuencias-nucleotidos "ACTGGACGGGTTTA")))
