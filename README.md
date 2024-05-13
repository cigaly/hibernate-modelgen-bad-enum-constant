# Hibernate 6 @CheckHQL not reporting missing constant in enum

When entity class is annotated with @CheckHQL annotation processor should report error when named query contains reference to non-existing constant in otherwise correct enum class. This check is not performed and error is not reported.

Suggested patch to fix that problem will be in pull request to Hibernate ORM repository.

