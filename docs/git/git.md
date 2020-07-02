## git

### 0. who & when & where：intro
这篇文档对git进行简单的介绍，并对git的常用指令和使用场景进行列举。

这篇文档是我在学习git时的记录，希望能够解决在开发过程中，多人协同开发场景下的git操作问题。

阅读这篇文档需要一定的开发经验以及对git系统有一定的了解，总体的阅读时间约为60min。

如果你希望对git系统的原理具有更加深入的了解，请参考文档[The Anatomy of Git](./git-anatomy.md)

### 1. what: 什么是git？
> Git is a fast, scalable, distributed revision control system with an unusually rich command set that provides both high-level operations and full access to internals.

git是一个**快速**，**可扩展**，**分布式**的版本控制系统，具有丰富的指令集，能够进行简单的高级操作，也能对仓库内部的数据进行控制。

### 2. why: 为什么需要使用git？
快速？

可扩展？

分布式？

what're the differences with csv? what're the benefits?

### 3. how：git安装

### 4. how：git原理

### 5. how：git指令
#### 5.1 git basic

#### 5.2 git advanced

#### 5.3 git candy
1. git log

    it's a paragraph under list item.
2. git grep
3. git show
4. git diff

### 6. how：常用场景
尽管我们了解了git的常用指令，但是git甚至整个软件领域都是建立在实用性以及解决实际问题的基础上的。因此，这一小节主要说明一下如何使用git指令去完成我们日常协同工作中经常出现的几种场景，每一个工作场景都可能包含一个或者多个git指令。希望这一部分能够解决大部分开发者对于git的实际疑问。

1. 不要使用git reset --hard commit_name & git branch branch_name去创建一个branch。
> in addition to losing any changes in the working directory, it will also remove all later commits from this branch. If this branch is the only branch containing those commits, they will be lost.

介绍一下git的三种使用场景
1. 开发全部在一个分支上
2. 开发创建不同的分支，并在完成功能迭代后merge
3. 开发使用fork repository的方式，在完成功能迭代并测试通过后再git pull
实际上，绝大多数情况下，我们都把git作为一个cvs来使用了

### 7. outro

### 8. 参考文献
1. Git官方文档 [1]

[1]: https://git-scm.com/docs "Git官方文档"

