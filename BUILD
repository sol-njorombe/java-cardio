load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "java-cardio-lib",
    srcs = glob(["src/main/java/com/Starter.java"]),
    deps = [
      "@maven//:com_google_guava_guava",
      "//src/main/java/com/cardio/exclamations:exclamation-lib"
      ],
)

java_binary(
    name = "java-cardio",
    main_class = "com.Starter",
    runtime_deps = [":java-cardio-lib"],
)

java_test(
    name = "tests",
    srcs = glob(["src/test/java/com/*.java"]),
    test_class = "com.StarterTest",
    deps = [
        ":java-cardio-lib",
        "@maven//:com_google_guava_guava",
        "@maven//:junit_junit",
    ],
)