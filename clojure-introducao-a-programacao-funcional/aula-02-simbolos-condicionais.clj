(defn valor-descontado
  "Retorna o valor com descontado de 10%."
  [valor-bruto]
  (let [desconto 0.10] 
    (println "Clculando desconto de:" desconto)
    (* valor-bruto (- 1 desconto))))
  
(println (valor-descontado 100))

(defn valor-descontado
  "Retorna o valor com descontado de 10%."
  [valor-bruto]
  (let [desconto (/ 10 100)]
    (println "Clculando desconto de:" desconto)
    (* valor-bruto (- 1 desconto))))

(println (valor-descontado 100))

;Aula 2 parte 2
(defn valor-descontado
  "Retorna o valor com descontado de 10%."
  [valor-bruto]
  (let [taxa-de-desconto (/ 10 100)
        desconto         (* valor-bruto taxa-de-desconto)]
    (println "Clculando desconto de:" desconto)
    (- valor-bruto desconto)))

(println (valor-descontado 100))

(> 500 100)
(< 500 100)
(if (> 500 100)
  (println "maior")
  (println "menor ou igual"))

(if (> 50 100)
  (println "maior")
  (println "menor ou igual"))

(defn valor-descontado
  "Retorna o valor com descontado de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (println "Clculando desconto de:" desconto)
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))

(println (valor-descontado 100))