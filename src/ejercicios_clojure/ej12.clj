(ns ejercicios-clojure.ej12)

(defn repartir
  ([] "Uno para vos, uno para mí")
  ([& more]
   (when (not (empty? more))
    (prn (str "Uno para " (first more) ", uno para mi"))
    (recur (next more)))))


(defn -main []
  (prn (repartir))
  (repartir "Federico" "Agustín" "Francisco"))