(defproject lein-immutant "0.5.1"
  :description "Leiningen plugin for managing an Immutant project."
  :url "https://github.com/immutant/lein-immutant"
  :mailing-list {:name "Immutant users list"
                 :post "immutant-users@immutant.org"
                 :subscribe "immutant-users-subscribe@immutant.org"
                 :unsubscribe "immutant-users-unsubscribe@immutant.org"}
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :eval-in-leiningen true
  :dependencies [[fleet                     "0.9.5"]
                 [org.immutant/overlay      "1.0.3"]
                 [org.immutant/deploy-tools "0.5.0"]
                 [org.clojure/data.json     "0.1.1"]])
