Project Promotion Engine:

Promotion Engine having 3 package :-

1. com.promotionengine.calculation
 This package contains CalcucateCost.java which having logic of doing promotion calculation on the basis of SKU's quantity.

2. com.promotionengine.execute
 This package contains ExecutePromtionEngine.java that having it's constructor to intialize the few "total value with 0" and "Option value with 1"
 That class having switch case statement by which user can choose which promotion needs to apply.
 
 Note:- As right now PromotionEngine having only one active promotions that's why I set Option as 1 in future we can take user Input form scanner class like what we have for SKU's Id in
 the main package class.
 
 3. com.promotionengine.main
 
 This package will trigger the application and intialize the above two classes. This classes will ask cosumer for SKU's Id quantity and pass it to ExecutePromtionEngine class for the calculation.
 