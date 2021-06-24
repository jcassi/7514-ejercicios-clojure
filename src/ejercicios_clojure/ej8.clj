(ns ejercicios-clojure.ej8)

(defn nth-fibo
  ([n]
    (cond
      (= n 0) 0
      (= n 1) 1
      :else (nth-fibo n 0 1 2)))
  ([n a b i]
    (if (= n i)
    (+ a b)
    (recur n b (+ a b) (inc i)))))

(defn -main []
  (prn (nth-fibo 8)))