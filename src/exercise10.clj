(ns exercise10)

(defn open-account []
  {:account 0}
)

(defn close-account [account]
  nil
)

(defn get-balance [account]
  (get account :account)
)

(defn update-balance [account amount]
  (assoc account :account (+ amount (get-balance account)))
)
