(ns ejercicios-clojure.ej5)

(defn capicua? [num]
  (= (str num) (apply str (reverse (str num)))))

(defn -main []
  (prn (capicua? 34143))
  (prn (capicua? 34145))
  (prn (capicua? 686))
  (prn (capicua? 689))
  (prn (capicua? 2)))

