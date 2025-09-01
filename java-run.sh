#!/bin/bash

# Always resolve the repo root (where this script lives)
ROOT_DIR="$(cd "$(dirname "$0")" && pwd)"

# Bin folder at repo root
BIN="$ROOT_DIR/bin"

# Make sure bin/ exists
mkdir -p "$BIN"

# Compile ALL Java files in the repo into bin/
javac -d "$BIN" $(find "$ROOT_DIR" -name "*.java")

# If you pass a class name, run it
if [ ! -z "$1" ]; then
  java -cp "$BIN" "$1"
fi

