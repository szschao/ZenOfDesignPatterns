zip和gzip相信大家都很熟悉
我们今天就来对一个目录或文件实现两种不同的压缩方式

注意:
对策略模式来说,Zip和Gzip算法没有本质上的区别,只是"形式"上不同
什么意思呢?从调用者的角度来看,使用哪一个算法都无所谓,两者完全可以互换,甚至用一个算法代替另外一个算法.

接收者分类:可以按类别分,也可以按职责分
举例:到饭店点菜,客人(请求者)通过服务员(调用者)向厨师(接收者)发送了订单(行为的请求)
具体要哪个厨师做这道菜则是餐馆的规章制度已经明确的

比如点了一个剁椒鱼头
按类别分:是要做川菜的厨师来做,你让一个专做粤菜的师傅做一个剁椒鱼头,能做出好菜吗?
按职责分:是要做鱼拿手的厨师来做,你让一个专门做糖醋排骨的做一个剁椒鱼头,能做出好才吗?

关于命令模式的撤回
比如客人点了一个菜,厨师还没来得及做,那要撤回很简单,撤回也是命令.这是策略模式所不能实现的.
