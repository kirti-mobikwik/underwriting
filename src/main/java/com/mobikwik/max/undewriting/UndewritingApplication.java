package com.mobikwik.max.undewriting;

import com.mobikwik.max.undewriting.org.tempuri.UWDecisionService;
import com.mobikwik.max.undewriting.org.tempuri.UWDecisionServiceSoap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UndewritingApplication {

    public static void main(String[] args) {
        UWDecisionService decisionService = new UWDecisionService();
        UWDecisionServiceSoap serviceSoap = decisionService.getUWDecisionServiceSoap();
        String decision = serviceSoap.getUWDecision("<![CDATA[<APPLICATION_FORM >\n" +
                "  <CUST_PIVOTAL_APP_ID>810000223825</CUST_PIVOTAL_APP_ID>\n" +
                "  <CUST_NATIONALITY>Indian</CUST_NATIONALITY>\n" +
                "  <CUST_SUM_INSURED>300000</CUST_SUM_INSURED>\n" +
                "  <CONT_PLAN_ID>2741526</CONT_PLAN_ID>\n" +
                "  <CUST_RENEW_FLAG>N</CUST_RENEW_FLAG>\n" +
                "  <PIV_RENEW_TYPE />\n" +
                "  <PARENT_APP_ID />\n" +
                "  <PREV_CONT_PLAN_ID />\n" +
                "  <MB_IS_PORTABILITY>No</MB_IS_PORTABILITY>\n" +
                "  <SOURCE_SYSTEM>Online</SOURCE_SYSTEM>\n" +
                "  <CHANNEL>Online</CHANNEL>\n" +
                "  <SUB_CHANNEL />\n" +
                "  <CITY_NAME>Delhi</CITY_NAME>\n" +
                "  <AGENT_CODE />\n" +
                "  <AGENT_DOJ />\n" +
                "  <AGENT_EDUCATION />\n" +
                "  <AGENT_WORK_SCHEDULE />\n" +
                "  <CUST_EDUCATION>None</CUST_EDUCATION>\n" +
                "  <CUST_OCCUPATION />\n" +
                "  <CONT_BUPA_BRANCH_LOC />\n" +
                "  <PERMANENT_CITY_NAME>Delhi</PERMANENT_CITY_NAME>\n" +
                "  <CUST_IS_PEP>No</CUST_IS_PEP>\n" +
                "  <CUST_PIN_CODE>110076</CUST_PIN_CODE>\n" +
                "  <CUST_IS_DEDUCTIBLE>0</CUST_IS_DEDUCTIBLE>\n" +
                "  <PA_COVER />\n" +
                "  <PA_OCCUPATION />\n" +
                "  <CI_COVER />\n" +
                "  <IS_EXISTING_POLICY>NO</IS_EXISTING_POLICY>\n" +
                "  <INSURED_DETAILS>\n" +
                "    <INSURED_DETAIL>\n" +
                "      <PIV_MBR_ID>147243</PIV_MBR_ID>\n" +
                "      <MBR_MBRSHP_NO />\n" +
                "      <WDMS_DEDUPE_MBR_ID />\n" +
                "      <MBR_DOB>07-Jul-1987</MBR_DOB>\n" +
                "      <MBR_HEIGHT>182.8</MBR_HEIGHT>\n" +
                "      <MBR_WEIGHT>80</MBR_WEIGHT>\n" +
                "      <MBR_NATIONALITY>Indian</MBR_NATIONALITY>\n" +
                "      <MBR_PROPOSER_RELATION>Self</MBR_PROPOSER_RELATION>\n" +
                "      <MBR_EDUCATION>None</MBR_EDUCATION>\n" +
                "      <MBR_OCCUPATION>None</MBR_OCCUPATION>\n" +
                "      <MBR_PAST_PROPOSAL>No</MBR_PAST_PROPOSAL>\n" +
                "      <MBR_IS_PEP>No</MBR_IS_PEP>\n" +
                "      <MBR_SEX>MALE</MBR_SEX>\n" +
                "      <FAMILY_HISTORY>No</FAMILY_HISTORY>\n" +
                "      <MBR_CURRENTLY_PREGNANT>no</MBR_CURRENTLY_PREGNANT>\n" +
                "      <TOBACCO_ANSWER>NO</TOBACCO_ANSWER>\n" +
                "      <ALCOHOL_ANSWER>YES</ALCOHOL_ANSWER>\n" +
                "      <SMOKING_ANSWER>NO</SMOKING_ANSWER>\n" +
                "      <TOBACCO_QTY>0</TOBACCO_QTY>\n" +
                "      <ALCOHOL_QTY>0</ALCOHOL_QTY>\n" +
                "      <IS_DAILY_DRINKER>NO</IS_DAILY_DRINKER>\n" +
                "      <SMOKING_QTY>0</SMOKING_QTY>\n" +
                "      <MBR_PA_COVER>YES</MBR_PA_COVER>\n" +
                "      <MBR_PA_OCCUPATION />\n" +
                "      <MBR_CI_COVER />\n" +
                "      <MBR_CI_MEDICAL_QUES />\n" +
                "      <MEDICAL_SF_QUESTIONS>\n" +
                "        <SF_QUESTION_1>No</SF_QUESTION_1>\n" +
                "        <SF_QUESTION_2>No</SF_QUESTION_2>\n" +
                "        <SF_QUESTION_3>No</SF_QUESTION_3>\n" +
                "        <SF_QUESTION_4>No</SF_QUESTION_4>\n" +
                "        <SF_QUESTION_5>No</SF_QUESTION_5>\n" +
                "        <SF_QUESTION_6>No</SF_QUESTION_6>\n" +
                "        <SF_QUESTION_7>No</SF_QUESTION_7>\n" +
                "      </MEDICAL_SF_QUESTIONS>\n" +
                "      <ADDITIONAL_MEDICAL_DETAIL>\n" +
                "        <QUESTION>1</QUESTION>\n" +
                "        <SYMPTOMS />\n" +
                "        <SYMPTOMS_DATE />\n" +
                "        <TREATMENT />\n" +
                "        <OUTCOME_TREATMENT />\n" +
                "        <DETAILS_OF_DOCTOR_OR_HOSPITAL />\n" +
                "        <DURATION_CONDITION />\n" +
                "        <DOSAGE />\n" +
                "        <HBA1C_LEVEL />\n" +
                "        <BP_DYSTOLIC />\n" +
                "        <BP_SYSTOLIC />\n" +
                "      </ADDITIONAL_MEDICAL_DETAIL>\n" +
                "    </INSURED_DETAIL>\n" +
                "    <INSURED_DETAIL>\n" +
                "      <PIV_MBR_ID>147244</PIV_MBR_ID>\n" +
                "      <MBR_MBRSHP_NO />\n" +
                "      <WDMS_DEDUPE_MBR_ID />\n" +
                "      <MBR_DOB>08-Jul-1990</MBR_DOB>\n" +
                "      <MBR_HEIGHT>182.8</MBR_HEIGHT>\n" +
                "      <MBR_WEIGHT>70</MBR_WEIGHT>\n" +
                "      <MBR_NATIONALITY>Indian</MBR_NATIONALITY>\n" +
                "      <MBR_PROPOSER_RELATION>Spouse</MBR_PROPOSER_RELATION>\n" +
                "      <MBR_EDUCATION>None</MBR_EDUCATION>\n" +
                "      <MBR_OCCUPATION>None</MBR_OCCUPATION>\n" +
                "      <MBR_PAST_PROPOSAL>No</MBR_PAST_PROPOSAL>\n" +
                "      <MBR_IS_PEP>No</MBR_IS_PEP>\n" +
                "      <MBR_SEX>FEMALE</MBR_SEX>\n" +
                "      <FAMILY_HISTORY>No</FAMILY_HISTORY>\n" +
                "      <MBR_CURRENTLY_PREGNANT>no</MBR_CURRENTLY_PREGNANT>\n" +
                "      <TOBACCO_ANSWER>NO</TOBACCO_ANSWER>\n" +
                "      <ALCOHOL_ANSWER>YES</ALCOHOL_ANSWER>\n" +
                "      <SMOKING_ANSWER>NO</SMOKING_ANSWER>\n" +
                "      <TOBACCO_QTY>0</TOBACCO_QTY>\n" +
                "      <ALCOHOL_QTY>0</ALCOHOL_QTY>\n" +
                "      <IS_DAILY_DRINKER>NO</IS_DAILY_DRINKER>\n" +
                "      <SMOKING_QTY>0</SMOKING_QTY>\n" +
                "      <MBR_PA_COVER>YES</MBR_PA_COVER>\n" +
                "      <MBR_PA_OCCUPATION />\n" +
                "      <MBR_CI_COVER />\n" +
                "      <MBR_CI_MEDICAL_QUES />\n" +
                "      <MEDICAL_SF_QUESTIONS>\n" +
                "        <SF_QUESTION_1>No</SF_QUESTION_1>\n" +
                "        <SF_QUESTION_2>No</SF_QUESTION_2>\n" +
                "        <SF_QUESTION_3>No</SF_QUESTION_3>\n" +
                "        <SF_QUESTION_4>No</SF_QUESTION_4>\n" +
                "        <SF_QUESTION_5>No</SF_QUESTION_5>\n" +
                "        <SF_QUESTION_6>No</SF_QUESTION_6>\n" +
                "        <SF_QUESTION_7>No</SF_QUESTION_7>\n" +
                "      </MEDICAL_SF_QUESTIONS>\n" +
                "      <ADDITIONAL_MEDICAL_DETAIL>\n" +
                "        <QUESTION>1</QUESTION>\n" +
                "        <SYMPTOMS />\n" +
                "        <SYMPTOMS_DATE />\n" +
                "        <TREATMENT />\n" +
                "        <OUTCOME_TREATMENT />\n" +
                "        <DETAILS_OF_DOCTOR_OR_HOSPITAL />\n" +
                "        <DURATION_CONDITION />\n" +
                "        <DOSAGE />\n" +
                "        <HBA1C_LEVEL />\n" +
                "        <BP_DYSTOLIC />\n" +
                "        <BP_SYSTOLIC />\n" +
                "      </ADDITIONAL_MEDICAL_DETAIL>\n" +
                "    </INSURED_DETAIL>\n" +
                "    <INSURED_DETAIL>\n" +
                "      <PIV_MBR_ID>147245</PIV_MBR_ID>\n" +
                "      <MBR_MBRSHP_NO />\n" +
                "      <WDMS_DEDUPE_MBR_ID />\n" +
                "      <MBR_DOB>08-Apr-2016</MBR_DOB>\n" +
                "      <MBR_HEIGHT>81.2</MBR_HEIGHT>\n" +
                "      <MBR_WEIGHT>20</MBR_WEIGHT>\n" +
                "      <MBR_NATIONALITY>Indian</MBR_NATIONALITY>\n" +
                "      <MBR_PROPOSER_RELATION>Son</MBR_PROPOSER_RELATION>\n" +
                "      <MBR_EDUCATION>None</MBR_EDUCATION>\n" +
                "      <MBR_OCCUPATION>None</MBR_OCCUPATION>\n" +
                "      <MBR_PAST_PROPOSAL>No</MBR_PAST_PROPOSAL>\n" +
                "      <MBR_IS_PEP>No</MBR_IS_PEP>\n" +
                "      <MBR_SEX>MALE</MBR_SEX>\n" +
                "      <FAMILY_HISTORY>No</FAMILY_HISTORY>\n" +
                "      <MBR_CURRENTLY_PREGNANT>no</MBR_CURRENTLY_PREGNANT>\n" +
                "      <TOBACCO_ANSWER>NO</TOBACCO_ANSWER>\n" +
                "      <ALCOHOL_ANSWER>YES</ALCOHOL_ANSWER>\n" +
                "      <SMOKING_ANSWER>NO</SMOKING_ANSWER>\n" +
                "      <TOBACCO_QTY>0</TOBACCO_QTY>\n" +
                "      <ALCOHOL_QTY>0</ALCOHOL_QTY>\n" +
                "      <IS_DAILY_DRINKER>NO</IS_DAILY_DRINKER>\n" +
                "      <SMOKING_QTY>0</SMOKING_QTY>\n" +
                "      <MBR_PA_COVER>NO</MBR_PA_COVER>\n" +
                "      <MBR_PA_OCCUPATION />\n" +
                "      <MBR_CI_COVER />\n" +
                "      <MBR_CI_MEDICAL_QUES />\n" +
                "      <MEDICAL_SF_QUESTIONS>\n" +
                "        <SF_QUESTION_1>No</SF_QUESTION_1>\n" +
                "        <SF_QUESTION_2>No</SF_QUESTION_2>\n" +
                "        <SF_QUESTION_3>No</SF_QUESTION_3>\n" +
                "        <SF_QUESTION_4>No</SF_QUESTION_4>\n" +
                "        <SF_QUESTION_5>No</SF_QUESTION_5>\n" +
                "        <SF_QUESTION_6>No</SF_QUESTION_6>\n" +
                "        <SF_QUESTION_7>No</SF_QUESTION_7>\n" +
                "      </MEDICAL_SF_QUESTIONS>\n" +
                "      <ADDITIONAL_MEDICAL_DETAIL>\n" +
                "        <QUESTION>1</QUESTION>\n" +
                "        <SYMPTOMS />\n" +
                "        <SYMPTOMS_DATE />\n" +
                "        <TREATMENT />\n" +
                "        <OUTCOME_TREATMENT />\n" +
                "        <DETAILS_OF_DOCTOR_OR_HOSPITAL />\n" +
                "        <DURATION_CONDITION />\n" +
                "        <DOSAGE />\n" +
                "        <HBA1C_LEVEL />\n" +
                "        <BP_DYSTOLIC />\n" +
                "        <BP_SYSTOLIC />\n" +
                "      </ADDITIONAL_MEDICAL_DETAIL>\n" +
                "    </INSURED_DETAIL>\n" +
                "  </INSURED_DETAILS>\n" +
                "</APPLICATION_FORM>]]>","UseQlVYMBLMRfIVQoTGm8oboCDRYTlEqK58DvKTWbYdChxJppMvbc+uRDRzuL7Bar9c1Bo5v2M9pgQ4a81ifAsNT7yQOmgB2yLT9YtyddFx3g5nGt85InFIz4O7YMomapmLTlz//uAQzpooex1jm0eBNfi1o2D+TINCsrpXiI5i7BDUwGF6rZTOYqWY0L/2XbNGocRkzfV6SjdM8de9yKqiIVMCgxVuiwORIQ92ex3Nwej7EK97kVqVXGaj+fviPJ8EDn7FOE7FDo/CaGC4YJkfdnfo7grNWzXIWKuWT6wTocPv1GxoS2rIAw4IvU4hE");
        System.out.println(decision);
    }

}
