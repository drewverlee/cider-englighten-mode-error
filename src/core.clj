(ns core)

;; connection info
;; Connected to nREPL server - nrepl://localhost:36187
;; CIDER 1.6.0 (Buenos Aires), nREPL 1.0.0
;; Clojure 1.11.1, Java 17.0.5

(require '[compojure.core :refer :all])

(defroutes myapp
  (GET "/" [] "Hello World"))

(myapp {:uri "/" :request-method :get})

;; without cider enlightment mode enabled
;; => {:status 200, :headers {"Content-Type" "text/html; charset=utf-8"}, :body "Hello World"}

;; with enlightment mode enabled
;;
;; 1. Unhandled java.lang.IllegalArgumentException
;;    No implementation of method: :route-matches of protocol: #'clout.core/Route
;;    found for class: clojure.lang.PersistentArrayMap

;;           core_deftype.clj:  584  clojure.core/-cache-protocol-fn
;;           core_deftype.clj:  576  clojure.core/-cache-protocol-fn
;;                  core.cljc:   51  clout.core$eval12123$fn__12124$G__12114__12131/invoke
;;                   core.clj:   46  compojure.core/route-matches
;;                   core.clj:   44  compojure.core/route-matches
;;                   core.clj:   49  compojure.core/route-request
;;                   core.clj:   48  compojure.core/route-request
;;                   core.clj:  145  compojure.core/wrap-route-matches/fn
;;                   core.clj:  185  compojure.core/routing/fn
;;                   core.clj: 2718  clojure.core/some
;;                   core.clj: 2709  clojure.core/some
;;                   core.clj:  185  compojure.core/routing
;;                   core.clj:  182  compojure.core/routing
;;                RestFn.java:  139  clojure.lang.RestFn/applyTo
;;                   core.clj:  669  clojure.core/apply
;;                   core.clj:  662  clojure.core/apply
;;                   core.clj:  192  compojure.core/routes/fn
;;                       REPL:    9  core/eval13107
;;                       REPL:   -1  core/eval13107
;;              Compiler.java: 7194  clojure.lang.Compiler/eval
;;              Compiler.java: 7149  clojure.lang.Compiler/eval
;;                   core.clj: 3215  clojure.core/eval
;;                   core.clj: 3211  clojure.core/eval
;;              enlighten.clj:   84  cider.nrepl.middleware.enlighten/eval-with-enlighten
;;              enlighten.clj:   78  cider.nrepl.middleware.enlighten/eval-with-enlighten
;;                   Var.java:  384  clojure.lang.Var/invoke
;;     interruptible_eval.clj:   87  nrepl.middleware.interruptible-eval/evaluate/fn/fn
;;                   AFn.java:  152  clojure.lang.AFn/applyToHelper
;;                   AFn.java:  144  clojure.lang.AFn/applyTo
;;                   core.clj:  667  clojure.core/apply
;;                   core.clj: 1990  clojure.core/with-bindings*
;;                   core.clj: 1990  clojure.core/with-bindings*
;;                RestFn.java:  425  clojure.lang.RestFn/invoke
;;     interruptible_eval.clj:   87  nrepl.middleware.interruptible-eval/evaluate/fn
;;                   main.clj:  437  clojure.main/repl/read-eval-print/fn
;;                   main.clj:  437  clojure.main/repl/read-eval-print
;;                   main.clj:  458  clojure.main/repl/fn
;;                   main.clj:  458  clojure.main/repl
;;                   main.clj:  368  clojure.main/repl
;;                RestFn.java: 1523  clojure.lang.RestFn/invoke
;;     interruptible_eval.clj:   84  nrepl.middleware.interruptible-eval/evaluate
;;     interruptible_eval.clj:   56  nrepl.middleware.interruptible-eval/evaluate
;;     interruptible_eval.clj:  152  nrepl.middleware.interruptible-eval/interruptible-eval/fn/fn
;;                   AFn.java:   22  clojure.lang.AFn/run
;;                session.clj:  218  nrepl.middleware.session/session-exec/main-loop/fn
;;                session.clj:  217  nrepl.middleware.session/session-exec/main-loop
;;                   AFn.java:   22  clojure.lang.AFn/run
;;                Thread.java:  833  java.lang.Thread/run
