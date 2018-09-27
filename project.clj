(defproject dactyl-keyboard "0.2.0-SNAPSHOT"
  :description "A parametrized, split-hand, concave, columnar, ergonomic keyboard"
  :url "http://viktor.eikman.se/article/the-dmote/"
  :license {:name "GNU Affero General Public License"
            :url "https://www.gnu.org/licenses/agpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.cli "0.3.7"]
                 [org.flatland/ordered "1.5.2"]
                 [clj-yaml "0.4.0"]
                 [unicode-math "0.2.1"]
                 [scad-clj "0.5.4-SNAPSHOT"]]
  :main dactyl-keyboard.core
  :aot :all
  :uberjar-name "dmote.jar")
