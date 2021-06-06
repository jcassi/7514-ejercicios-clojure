(ns ejercicios-clojure.ej2
  (:gen-class))

(defn segundos [dias horas minutos segs]
  (+ segs (* minutos 60) (* horas 3600) (* dias 86400)))

(defn -main []
  (prn (segundos 1 2 5 17)))
