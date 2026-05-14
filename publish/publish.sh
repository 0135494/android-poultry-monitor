#!/usr/bin/env bash
set -euo pipefail

REPO_URL="https://github.com/0135494/android-poultry-monitor.git"
BRANCH="main"

echo "Инициализация локального репозитория..."
git init
git add .
git commit -m "feat: initial Android MVVM + Room + Compose project for poultry management"

echo "Публикация на GitHub..."
git branch -M ${BRANCH}
git remote add origin ${REPO_URL}
git push -u origin ${BRANCH}
echo "Готово. Репозиторий должен быть доступен по ${REPO_URL}"
