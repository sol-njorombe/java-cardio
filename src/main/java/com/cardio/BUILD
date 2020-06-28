load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "cardio-lib",
    srcs = glob(["*.java"]),
)

java_binary(
    name = "cardio",
    runtime_deps = [":cardio-lib"],
)