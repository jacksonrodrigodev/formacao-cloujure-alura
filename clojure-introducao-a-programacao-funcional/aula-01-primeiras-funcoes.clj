(println "Bem vindo ao sistema de estoque!")

(def total-de-produtos 15)

(println "Total de produtos: " total-de-produtos)

(def total-de-produtos 13)

(println "Total de produtos: " total-de-produtos)

(+ 13 3)

(- 13 3)

(+ total-de-produtos 3)

(def total-de-produtos (+ total-de-produtos 3))

(println "Total" total-de-produtos)

(def estoque ["Mochila", "Camiseta"])

(println "Estoque: " estoque)

(estoque 0)
(println "Primeiro produto: " (estoque 0))
(println "Segundo produto: " (estoque 1))

(count estoque)
(println "Total de produtos: " (count estoque))

(conj estoque "Cadeira")
(println "Estoque: " (conj estoque "Cadeira"))
(println "Estoque: " estoque)

(def estoque (conj estoque "Cadeira"))
(println "Estoque: " estoque)

; Parte 2 da aula 1

(defn imprime-mensagem []
  (println "--------------Parte 2 da aula 1------------------")
  (println "Bem vindo(a) ao estoque!"))
(imprime-mensagem)

(defn aplica-desconto [valor-bruto]
  (* valor-bruto 0.9))
(aplica-desconto 100)

(defn valor-descontado 
  "Retorna o valor descontado que é 90% do valor bruto"
  [valor-bruto]
  (* valor-bruto 0.9))
(valor-descontado 100)

(defn valor-descontado
  "Retorna o valor com descontado de 10%."
  [valor-bruto]
  (* valor-bruto (- 1 0.10)))
(valor-descontado 100)



