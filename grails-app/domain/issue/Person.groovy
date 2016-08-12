package issue

/*
 * Grails 3.2.0.M2 creates the following setter method (when .class-file is viewed with JD-GUI) with three calls to markDirty().
 *
 * <pre>
 *   public void setFirstName(String firstName)
 * {
 *   CallSite[] arrayOfCallSite = $getCallSiteArray();
 *   markDirty("firstName", firstName);
 *   null;
 *   markDirty("firstName", firstName);
 *   null;
 *   markDirty("firstName", firstName);
 *   null;
 *   String str = firstName;
 *   this.firstName = ((String)ShortTypeHandling.castToString(str));
 * }
 * </pre>
 */
class Person {
    String firstName
    String lastName
}
