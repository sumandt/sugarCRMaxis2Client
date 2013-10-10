
/**
 * SugarsoapCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.3  Built on : Nov 12, 2010 (02:24:07 CET)
 */

    package com.sugarcrm.www.sugarcrm;

    /**
     *  SugarsoapCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SugarsoapCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SugarsoapCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SugarsoapCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for set_note_attachment method
            * override this method for handling normal response from set_note_attachment operation
            */
           public void receiveResultset_note_attachment(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Set_note_attachmentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from set_note_attachment operation
           */
            public void receiveErrorset_note_attachment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for logout method
            * override this method for handling normal response from logout operation
            */
           public void receiveResultlogout(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.LogoutResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from logout operation
           */
            public void receiveErrorlogout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_user_id method
            * override this method for handling normal response from get_user_id operation
            */
           public void receiveResultget_user_id(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_user_idResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_user_id operation
           */
            public void receiveErrorget_user_id(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for set_relationships method
            * override this method for handling normal response from set_relationships operation
            */
           public void receiveResultset_relationships(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Set_relationshipsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from set_relationships operation
           */
            public void receiveErrorset_relationships(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for set_entry method
            * override this method for handling normal response from set_entry operation
            */
           public void receiveResultset_entry(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Set_entryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from set_entry operation
           */
            public void receiveErrorset_entry(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_available_modules method
            * override this method for handling normal response from get_available_modules operation
            */
           public void receiveResultget_available_modules(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_available_modulesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_available_modules operation
           */
            public void receiveErrorget_available_modules(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.LoginResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_user_team_id method
            * override this method for handling normal response from get_user_team_id operation
            */
           public void receiveResultget_user_team_id(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_user_team_idResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_user_team_id operation
           */
            public void receiveErrorget_user_team_id(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_document_revision method
            * override this method for handling normal response from get_document_revision operation
            */
           public void receiveResultget_document_revision(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_document_revisionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_document_revision operation
           */
            public void receiveErrorget_document_revision(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_entries_count method
            * override this method for handling normal response from get_entries_count operation
            */
           public void receiveResultget_entries_count(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_entries_countResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_entries_count operation
           */
            public void receiveErrorget_entries_count(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_module_fields method
            * override this method for handling normal response from get_module_fields operation
            */
           public void receiveResultget_module_fields(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_module_fieldsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_module_fields operation
           */
            public void receiveErrorget_module_fields(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for set_relationship method
            * override this method for handling normal response from set_relationship operation
            */
           public void receiveResultset_relationship(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Set_relationshipResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from set_relationship operation
           */
            public void receiveErrorset_relationship(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_last_viewed method
            * override this method for handling normal response from get_last_viewed operation
            */
           public void receiveResultget_last_viewed(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_last_viewedResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_last_viewed operation
           */
            public void receiveErrorget_last_viewed(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for set_campaign_merge method
            * override this method for handling normal response from set_campaign_merge operation
            */
           public void receiveResultset_campaign_merge(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Set_campaign_mergeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from set_campaign_merge operation
           */
            public void receiveErrorset_campaign_merge(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for search_by_module method
            * override this method for handling normal response from search_by_module operation
            */
           public void receiveResultsearch_by_module(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Search_by_moduleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from search_by_module operation
           */
            public void receiveErrorsearch_by_module(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_server_info method
            * override this method for handling normal response from get_server_info operation
            */
           public void receiveResultget_server_info(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_server_infoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_server_info operation
           */
            public void receiveErrorget_server_info(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_module_fields_md5 method
            * override this method for handling normal response from get_module_fields_md5 operation
            */
           public void receiveResultget_module_fields_md5(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_module_fields_md5Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_module_fields_md5 operation
           */
            public void receiveErrorget_module_fields_md5(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for set_document_revision method
            * override this method for handling normal response from set_document_revision operation
            */
           public void receiveResultset_document_revision(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Set_document_revisionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from set_document_revision operation
           */
            public void receiveErrorset_document_revision(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for set_entries method
            * override this method for handling normal response from set_entries operation
            */
           public void receiveResultset_entries(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Set_entriesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from set_entries operation
           */
            public void receiveErrorset_entries(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_entry_list method
            * override this method for handling normal response from get_entry_list operation
            */
           public void receiveResultget_entry_list(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_entry_listResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_entry_list operation
           */
            public void receiveErrorget_entry_list(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_upcoming_activities method
            * override this method for handling normal response from get_upcoming_activities operation
            */
           public void receiveResultget_upcoming_activities(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_upcoming_activitiesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_upcoming_activities operation
           */
            public void receiveErrorget_upcoming_activities(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_relationships method
            * override this method for handling normal response from get_relationships operation
            */
           public void receiveResultget_relationships(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_relationshipsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_relationships operation
           */
            public void receiveErrorget_relationships(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_note_attachment method
            * override this method for handling normal response from get_note_attachment operation
            */
           public void receiveResultget_note_attachment(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_note_attachmentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_note_attachment operation
           */
            public void receiveErrorget_note_attachment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_entry method
            * override this method for handling normal response from get_entry operation
            */
           public void receiveResultget_entry(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_entryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_entry operation
           */
            public void receiveErrorget_entry(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get_entries method
            * override this method for handling normal response from get_entries operation
            */
           public void receiveResultget_entries(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Get_entriesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get_entries operation
           */
            public void receiveErrorget_entries(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for seamless_login method
            * override this method for handling normal response from seamless_login operation
            */
           public void receiveResultseamless_login(
                    com.sugarcrm.www.sugarcrm.SugarsoapStub.Seamless_loginResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from seamless_login operation
           */
            public void receiveErrorseamless_login(java.lang.Exception e) {
            }
                


    }
    