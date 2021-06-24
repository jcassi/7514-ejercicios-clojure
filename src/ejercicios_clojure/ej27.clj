(ns ejercicios-clojure.ej27)

(defn letras-repetidas? [palabra]
  (not (= (count (frequencies palabra)) (count palabra))))

(defn -main []
  (prn (letras-repetidas? "asdfs"))
  (prn (letras-repetidas? "poiu")))