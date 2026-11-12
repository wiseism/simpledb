# 2026-11-10 gradle.yml dependency-submission 失败修复

## 现象

GitHub Actions `Java CI with Gradle` 中 `build` job 成功，但 `dependency-submission` job 失败：

```
HttpError: Dependency submission failed ...
The Dependency graph is disabled for this repository. Please enable it before submitting snapshots.
```

## 根因

仓库的 Dependency graph 功能处于关闭状态，`gradle/actions/dependency-submission@v4` 无法提交依赖快照（这是仓库设置问题，不是代码问题）。

## 修复

从 `.github/workflows/gradle.yml` 中移除 `dependency-submission` job，仅保留 `build`。如需依赖提交，可到仓库 Settings → Code security 开启 Dependency graph 后再加回。

## 验证记录
| Run | 结果 |
|---|---|
| 42833574839 (build) | ✅ success |
| 42833616159 (dependency-submission 旧版修复验证) | ✅ success |
