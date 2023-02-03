@echo off
call build.bat

echo 复制命令文件
copy Procfile  "target/Procfile"

echo 复制Docker配置
copy Dockerfile  "target/Dockerfile"

cd target

git init
ssh -t dokkuser@changsheng.local dokku --force apps:destroy prewviewurl
git add .
git commit -m "project preview"
git remote add dokku dokku@changsheng.local:prewviewurl
ssh -t dokkuser@changsheng.local dokku apps:create prewviewurl

git push dokku master

IF ERRORLEVEL 1 goto ERRORHANDLER
IF ERRORLEVEL 0 goto DONE

:ERRORHANDLER
echo 部署API服务出错
pause


:DONE
exit