# Hibernate 6 @CheckHQL not reporting missing constant in enum

When entity class is annotated with @CheckHQL annotation processor should report error when named query contains reference to non-existing constant in otherwise correct enum class. This check is not performed and error is not reported.

Suggested patch to fix that problem will be in pull request to Hibernate ORM repository.

Just execute `./gradlew clean build` on UNIX/Linux or `gradlew.bat clean build` on Windows. 

With correct implementation compilation should fail with error message

```
CookBook.java:12: error: Could not interpret path expression 'org.hibernate.jpamodelgen.test.enumconstant.BookType.GOOD_BOOK'
                query = "from CookBook where bookType = org.hibernate.jpamodelgen.test.enumconstant.BookType.GOOD_BOOK")
                        ^
1 error

```

However, nothing is reported.

