#_{:clj-kondo/ignore [:namespace-name-mismatch]}
(ns aula-03)

(println "Bem vindo ao sistema de estoque")

(defn valor-descontado
  "Retorna o valor com descontado de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println #_{:clj-kondo/ignore [:invalid-arity]}
         (valor-descontado 1000))

(println #_{:clj-kondo/ignore [:invalid-arity]}
         (valor-descontado 100))

;PREDICATE
(defn deve-aplicar-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

(println (deve-aplicar-desconto? 1000))
(println (deve-aplicar-desconto? 100))

;PREDICATE
(defn aplicar-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))

(defn valor-descontado
  "Retorna o valor com descontado de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (aplicar-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(defn aplicar-desconto?
  [valor-bruto]
  (println "chamando a versao redefinida")
  (if (> valor-bruto 100)
    true))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))

(defn aplicar-desconto?
  [valor-bruto]
  (println "chamando a versao com when")
  (when (> valor-bruto 100)
    true))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))

(defn aplicar-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))

(defn mais-caro-que-100?
  [valor-bruto]
  (println "invoca de mais-caro-que-100?")
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com descontado de 10% se deve aplicar desconto."
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "função com parâmetro")
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))

(println "função anonima")
(println(valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 100))
(println (valor-descontado (fn [v] (> v 100)) 1000))
(println (valor-descontado (fn [v] (> v 100)) 100))
(println (valor-descontado #(> %1 100) 1000))
(println (valor-descontado #(> %1 100) 100))
(println (valor-descontado #(> % 100) 1000))
(println (valor-descontado #(> % 100) 100))

#_{:clj-kondo/ignore [:redefined-var]}
(def mais-caro-que-100? (fn [valor-bruto] (> valor-bruto 1000)))
#_{:clj-kondo/ignore [:redefined-var]}
(def mais-caro-que-100? #(> % 100))
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))