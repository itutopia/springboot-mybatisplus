Git
==========
Workspace: 工作区
Index/Stage: 暂存区
Repository: 仓库区(或本地仓库区)
Remote: 远程仓库



$ git init  ->  初始化git仓库
$ git init [project-name]
$ git clone [git-url]


$ git config --list
$ git config -e [--global]
$ git config --global user.name "[name]"
$ git config --global user.email "[email]"


$ git status

$ git log

###  添加当前目录的所有文件到暂存区
$ git add .
# 删除工作区文件，并且将这次删除放入暂存区
$ git rm [file1] [file2] ...

### 提交代码到暂存区
$ git commit -m "[messge]"
$ git commit [file1] [file2] ... -m "[messge]"
$ git commit -v
### 切换master分支
git checkout master


### 远程仓库
查看远程仓库
git remote -v 

添加远程仓库
git remote add origin 


分支
# 列出所有本地分支和远程分支
$ git branch 
$ git branch -a
# 列出所有远程分支
$ git branch -r

# 新建一个分支,但依然停留在当前分支
$ git branch [branch-name]
# 新建一个分支,并切换到该新建分支
$ git checkout -b [branch-name]
# 切换到上一个分支
$ git checkout -
# 删除一个分支
$ git branch -d [branch-name]

# 删除远程分支
$ git push origin --delete [branch-name]

# 合并指定分支到当前分支
$ git merge [branch-name]

### 删除远程分支
git checkout origin -delete master


## Tag 标签
# 列出所有tag
$ git tag

# 新建一个tag在当前commit
$ git tag [tag] [commit]

# 删除远程tag
$ git tag -d [tag]

# 删除远程tag
$ git push origin :refs/tags/[tagName]

# 提交指定tag
$ git push [remote] [tag]



# 显示暂存区和工作区的差异
$ git diff
# 显示工作区与当前分支最新commit之间的差异
$ git diff HEAD
# 显示今天你写了多少行代码
$ git diff --shortstat "@{0 day ago}"


### 下载远程仓库的所有变动
$ git fetch [remote]


$ git pull

## 上传本地指定分支到远程仓库
$ git push remote [branch-name]
