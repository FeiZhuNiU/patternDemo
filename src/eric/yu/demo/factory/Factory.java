package eric.yu.demo.factory;
/*===========================================================================+
 |      Copyright (c) 2014 Oracle Corporation, Redwood Shores, CA, USA       |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 |           Created by lliyu on 4/28/2015  (lin.yu@oracle.com)              |
 +===========================================================================*/

public abstract class Factory
{
    public Product order(String name){
        Product product = produce(name);
        product.getName();
        return product;
    }
    protected abstract Product produce(String name);
}
