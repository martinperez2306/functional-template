(ns exercise8)

(defn squear
  "Returns the squear of a given number"
  [x]
  (* x x)
)

(defn fderive
  "Returns a function that approximates the derive of f with error h in the value given to the returned function."
  [f h]
  (fn [a] (/ (- (f (+ a h)) (f (- a h))) (* h 2)))
)
