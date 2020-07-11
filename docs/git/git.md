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

git add
git status
git diff
git commit
git note
git restore
git reset
git rm
git mv


git checkout
git switch
git merge
git mergetool
git log
git stash
git tag
git worktree

git pull
git push
git remote
git submodule

git show
git log
git diff
git difftool
git range-diff
git shortlog
git describe

git apply
git cherry-pick
git rebase
git revert

git bisect
git blame

git cat-file
git check-ignore
git checkout-index
git commit-tree
git count-objects
git diff-index
git for-each-ref
git hash-object
git ls-files
git ls-tree
git merge-base
git read-tree
git rev-list
git rev-parse
git show-ref
git symbolic-ref
git update-index
git update-ref
git verify-pack
git write-tree

#### 5.1 git basic
1. **git init**

    git init，创建一个空的git仓库，并在仓库中完成git database（.git）的创建，可以使用--object-format指定object的的hash算法（sha1 or sha256，默认sha1）
    ```bash
    git init
    ```
2. **git clone**

    git clone，在
    ```bash
    git clone git://git.kernel.org/pub/scm/.../linux.git my-linux
    ```
3. **git branch**

    git branch, 这个指令被用来查找，创建或删除branch
    
    当使用branch创建分支的时候，如果start-point在一个远程分支上面，那么会自动设置`branch.<name>.remote`和`branch.<name>.merge`，将star-point所在的分支标记为新分支的upstream
    
    upstream的用途是当使用`git status`或者`git version -v`的时候，可以获得两个分支的关系；当使用`git pull`的时候可以不需要指定对应的远程分支。
    ```bash
    ############## 以下参数可以随意组合 ###############
    # 列举当前仓库中所有的branch
    git branch
    git branch --list
    # 使用正则过滤
    git branch --list [pattern]
    # list中包含remote branch
    git branch --remotes
    # list中包含所有分支
    git branch --all
    # 列举当前仓库中包含HEAD的所有branch
    git branch --contains
    # 列举当前仓库中所有包含commit的branch
    git branch --contains [commit-name]
    # 列举不包含的
    git branch --no-contains [commit-name]
    # 列举当前仓库中所有从commit处可以到达的branch（可以想象为从上往下搜索）
    git branch --merged [commit-name]
    # 创建新branch
    git branch [branch-name]
    # 以某个commit为起点创建新branch
    git branch [branch-name] [start-point]
    # 以某两个分支的merge点为起点创建新branch
    git branch [branch-name] A...B
    # 以A分支和HEAD的merge点为起点创建新branch
    git branch [branch-name] A...
    # 修改分支名
    git branch -m [old-branch-name] [new-branch-name]
    # 删除分支
    git branch -d [branch-name]
    # 删除本地和远程分支(只有远程仓库已经没有这个分支的时候才能成功删除远程分支)
    git branch -d -r [branch-name]
    # 修改branch的upstream
    git branch --set-upstream-to=[start-point] [branch-name]
    ```
4. git fetch

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
1. [Git官方文档](https://git-scm.com/docs) 

[1]: https://git-scm.com/docs "Git官方文档"

