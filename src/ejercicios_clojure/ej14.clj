(ns ejercicios-clojure.ej14)

(defn adn2arn [adn]
  (let [adn-map {\G \C, \C \G, \T \A, \A \U}, adn-vec (vec adn)]
    (apply str (map adn-map adn-vec))))

(defn -main []
  (prn (adn2arn "GCTA")))