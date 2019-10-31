(ns app.main
  (:require ["react-intl" :as intl]
            [reagent.core :as r]))

;; App

(def defaultMessage
  "Hello {name}, you have {unreadCount, number}
   {unreadCount, plural, one {message} other {messages}}")

(def values
  {:name "Eric" :unreadCount 100})

(defn example-app []
  [:p
   [:> intl/IntlProvider {:locale "en"}
    [:> intl/FormattedMessage {:id "welcome"
                               :defaultMessage defaultMessage
                               :values values}]]])

;; App initialization

(defn mount-root []
  (r/render [example-app] (.getElementById js/document "app")))

(defn main! []
  (mount-root)
  (println "[core]: loading"))

(defn reload! []
  (mount-root)
  (println "[core] reloaded"))
