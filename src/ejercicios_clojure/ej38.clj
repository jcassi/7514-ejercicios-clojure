(ns ejercicios-clojure.ej38)

(defn distl [a b]
  (map (fn [x] (list a x)) b))

(defn -main []
  (prn(distl 'a '(b c d))))
