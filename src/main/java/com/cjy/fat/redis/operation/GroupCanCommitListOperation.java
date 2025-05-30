package com.cjy.fat.redis.operation;

public interface GroupCanCommitListOperation {

   /**
    * 将groupServiceSet的元素放入到groupCancommit
    */
   public void pushGroupServiceSetToGroupCommitList(String txKey);

   /**
    * 获取事务分组协调器可提交标识
    * @param rootTxKey
    * @param waitMilliesSecond
    * @return
    */
   public String popGroupCancommit(String rootTxKey , long waitMilliesSecond) ;


}
