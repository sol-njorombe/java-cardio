load("@rules_java//java:defs.bzl", "java_test")

java_test(
    name = "frogs-tests",
    srcs = glob(["FrogsTest.java"]),
    test_class = "com.cardio.FrogsTest",
    deps = [
      "//src/main/java/com/cardio:cardio-lib",
      "@maven//:com_google_guava_guava",
      "@maven//:junit_junit",
    ],
)

java_test(
    name = "exclamation_test",
    srcs = glob(["ExclamationsTest.java"]),
    test_class = "com.cardio.ExclamationsTest",
    deps = [
      "//src/main/java/com/cardio:cardio-lib",
      "@maven//:com_google_guava_guava",
      "@maven//:junit_junit",
    ],
)