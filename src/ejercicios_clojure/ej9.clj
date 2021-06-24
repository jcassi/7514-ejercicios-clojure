(ns ejercicios-clojure.ej9)

(defn cant-dig [num]
  (if (neg? num)
    (- (count (str num)) 1)
    (count (str num))))

(defn -main []
  (prn (cant-dig 456))
  (prn (cant-dig 1))
  (prn (cant-dig -1))
  (prn (cant-dig -548)))